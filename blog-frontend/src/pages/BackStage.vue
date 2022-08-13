<template>
  <div>
    <NavBar @selectedMenuChange="HandleMenuChange"></NavBar>
    <div id="blog-main-content">
      <HomeView v-if="menuIndex == 1"></HomeView>
      <AboutView v-else-if="menuIndex == 2"></AboutView>
    </div>
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
#blog-nav-menu {

}

#blog-main-content {

}
</style>