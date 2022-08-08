<template>
  <div id="login_page_container">
    <div class="loginBox" id="login_box_container">
      <Vcode :show="isShow" @success="dragSuccess" @close="closeVerifyCode" />
        <h3 class="loginBox_title">用户登录</h3>
        <div v-show="isSignIn" class="login_box_form">
          <el-row type="flex" justify="center" style="margin-top: 20px">
            <el-form ref="form" :model="form" label-width="70px" size="small">
              <el-form-item label="用户名" :rules="[{required: true, message: '用户名不能为空!'}]">
                <el-input v-model="form.username"></el-input>
              </el-form-item>
              <el-form-item label="密码" :rules="[{required: true, message: '密码不能为空!'}]">
                <el-input type="password" v-model="form.password"></el-input>
              </el-form-item>
              <el-form-item label-width="0px">
                <el-button type="primary" @click="onSignIn">登录</el-button>
                <el-button @click="onSignUp">注册</el-button>
              </el-form-item>
            </el-form>
          </el-row>
        </div>
        <div id="registerBox" v-show="isSignUp">
          <el-row type="flex" justify="center" style="margin-top: 20px">
            <el-form ref="registerForm" :model="registerForm" label-width="80px" size="small">
              <el-form-item label="用户名" :rules="[{required: true, message: '用户名不能为空!'}]">
                <el-input v-model="registerForm.username"></el-input>
              </el-form-item>
              <el-form-item label="密码" :rules="[{required: true, message: '密码不能为空!'}]">
                <el-input type="password" v-model="registerForm.presetPwd"></el-input>
              </el-form-item>
              <el-form-item label="确认密码" :rules="[{required: true, message: '密码不能为空!'}]">
                <el-input type="password" v-model="registerForm.confirmPwd"></el-input>
              </el-form-item>
              <el-form-item label-width="0px">
                <el-button type="primary" @click="onConfirm">确认</el-button>
                <el-button @click="onCancel">返回</el-button>
              </el-form-item>
            </el-form>
          </el-row>
        </div>
    </div>
  </div>
</template>

<script>
import Vcode from "vue-puzzle-vcode";

export default {
    name: 'LoginPage',
    components: {
      Vcode
    },
    data(){
      return {
        form: {
          username: '',
          password: ''
        },
        registerForm: {
          username: '',
          presetPwd: '',
          confirmPwd: ''
        },
        isSignIn: true,
        isSignUp: false,
        isShow: false
      }
    },
    methods: {
      onSignIn(){
        this.isShow = true;
      },
      onSignUp(){
        this.isSignUp = true;
        this.isSignIn = false;
      },
      onConfirm(){
        if (this.registerForm.presetPwd === this.registerForm.confirmPwd) {
          this.$axios.post("/api/account/register",
              {
                username: this.registerForm.username,
                password: this.registerForm.presetPwd
              }).then(res => {
            console.log(res);
          }).catch(err => {
            console.log(err);
          })
        } else {
          alert('确认密码与预设密码不一致!');
        }
      },
      onCancel(){
        this.isSignUp = false;
        this.isSignIn = true;
      },
      dragSuccess(){
        this.$axios.post("/api/account/login", this.form).then(res => {
          console.log(res);
          if (res.data.res === 1) {
            this.$router.push("/backstage");
          }
          else {
            alert("用户名或密码错误!");
          }
        }).catch(err => {
          console.log(err)
        })
      },
      closeVerifyCode() {
        this.isShow = false;
      }
    }
};
</script>

<style scoped>

#login_page_container {
  background: url("../assets/background.jpeg") no-repeat;
  width: 100%;
  height: 100%;
  position: fixed;
  background-size: 100% 100%;
}

.loginBox {
  width: 300px;
  height: 350px;
  background: white;
  border-radius: 6px;
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  margin: auto;
  align-content: center;
  box-shadow: 5px 5px 10px rgba(0,0,0,0.6);
}

.loginBox_title {
  width: 300px;
  height: 70px;
  margin: auto;
  background: url("../assets/loginHeader.jpeg") center center no-repeat;
  line-height: 70px;
  border-radius: 5px 5px 0 0;
  color: white;
}

.login_box_form {
  margin-top: 30px;
}

</style>