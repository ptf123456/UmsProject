import Vue from 'vue'
import Router from 'vue-router'
import news from "@/components/news";
import technology from "@/components/technology";
import feel from "@/components/feel";

Vue.use(Router)

export default new Router({
  routes: [{
    path: "/news",
    name: "news",
    component:  news
  },{
    path: "/technology",
    name: "technology",
    component: technology
  },{
    path: "/submitFeel",
    name: "feel",
    component: feel
  }]
})
