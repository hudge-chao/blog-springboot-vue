<template>
  <div>
    <el-container>
      <el-aside width="15%">
        <NavBar @selectedMenuChange="HandleMenuChange"></NavBar>
      </el-aside>
      <el-container>
        <el-header height="8%" style="border-bottom: 1px solid rgba(109, 108, 108, 0.6);">
          <el-row type="flex">
            <el-col :span="4" :offset="16" style="min-height: 60px; line-height: 60px;">
              <i class="el-icon-s-custom"></i>
              <span style="margin-left: 5px;">个人中心</span>
            </el-col>
            <el-col :span="4" style="line-height: 60px;">
              <i class="el-icon-warning"></i>
              <span style="margin-left: 5px;">退出</span>
            </el-col>
          </el-row>
        </el-header>
        <el-main>
          <HomeView v-if="menuIndex == 1"></HomeView>
          <AboutView v-else-if="menuIndex == 2"></AboutView>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
import NavBar from "@/components/NavBar";
import HomeView from "@/components/HomeView";
import AboutView from "@/components/AboutView";

export default {
  name: "BackStage",
  data(){
    return {
      menuIndex: 1
    }
  },
  components: {
    NavBar,
    HomeView,
    AboutView
  },
  methods: {
    HandleMenuChange(index) {
      console.log(index);
      this.menuIndex = index;
    }
  }
}
</script>

<style scoped>

</style>