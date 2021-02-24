import Vue from 'vue'
import Router from 'vue-router'
import wang from "@/components/wang";
import su from "@/components/su";
import li from "@/components/li";

Vue.use(Router)

export default new Router({
  routes: [{
    path: "/wang",
    name: "wang",
    component: wang
  },{
    path: "/su",
    name: "su",
    component: su
  },{
    path: "/li",
    name: "li",
    component: li
  }]
})
