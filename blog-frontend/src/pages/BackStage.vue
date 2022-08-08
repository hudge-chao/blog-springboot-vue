<template>
  <div>
    <div class="nav_bar">
        <NavBar></NavBar>
    </div>
    <HomeView></HomeView>
    <AboutView></AboutView>
  </div>

</template>

<script>
import NavBar from "@/components/NavBar";
import HomeView from "@/components/HomeView";
import AboutView from "@/components/AboutView";

export default {
  name: "BackStage",
  components: {
    NavBar,
    HomeView,
    AboutView
  },
  methods: {

  }
}
</script>

<style scoped>
.nav_bar {
  height: 100vh;
}
</style>