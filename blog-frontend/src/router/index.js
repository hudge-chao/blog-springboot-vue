import Vue from 'vue'
import Router from 'vue-router'
import LoginPage from '@/pages/LoginPage'
import BackStage from "@/pages/BackStage";

Vue.use(Router);

export default new Router({
    routes: [
        {
            path: '/login',
            component: LoginPage
        },
        {
            path: '/backstage',
            component: BackStage
        }
    ]
});