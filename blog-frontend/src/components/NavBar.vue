<template>
  <div>
    <el-col :xs="{span: 5}" :sm="{span: 4}">
      <el-menu
          default-active="1"
          class="el-menu-vertical-demo"
          @select="handleSelect"
          background-color="#545c64"
          text-color="#fff"
          active-text-color="#ffd04b">
        <el-menu-item index="1">
          <i class="el-icon-s-home"></i>
          <span slot="title">首页</span>
        </el-menu-item>
        <el-menu-item index="2">
          <i class="el-icon-upload"></i>
          <span slot="title">发布文章</span>
        </el-menu-item>
        <el-menu-item index="3">
          <i class="el-icon-document"></i>
          <span slot="title">文章管理</span>
        </el-menu-item>
        <el-menu-item index="4">
          <i class="el-icon-message"></i>
          <span slot="title">消息管理</span>
        </el-menu-item>
        <el-menu-item index="5">
          <i class="el-icon-menu"></i>
          <span slot="title">用户管理</span>
        </el-menu-item>
        <el-menu-item index="6">
          <i class="el-icon-s-tools"></i>
          <span slot="title">系统管理</span>
        </el-menu-item>
        <el-menu-item index="7">
          <i class="el-icon-s-comment"></i>
          <span slot="title">日志管理</span>
        </el-menu-item>
        <el-menu-item index="8">
          <i class="el-icon-user-solid"></i>
          <span slot="title">个人中心</span>
        </el-menu-item>
      </el-menu>
    </el-col>
  </div>
</template>

<script>
export default {
  name: "NavBar",
  methods: {
    handleSelect(index) {
      console.log(index);
    }
  }
}
</script>

<style scoped>
.el-menu-vertical-demo {
  height: 100vh;
}

</style>