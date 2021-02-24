import Vue from 'vue'
import Router from 'vue-router'
import xian from "@/components/xian";
import xianyang from "@/components/xianyang";
import xingping from "@/components/xingping";
import baoji from "@/components/baoji";
import guozhen1 from "@/components/guozhen1";
import guozhen2 from "@/components/guozhen2";
import guozhen3 from "@/components/guozhen3";

Vue.use(Router)

export default new Router({
  routes: [{
    path: "/xian",
    name: "xian",
    component: xian
  },{
    path: "/xianyang",
    name: "xianyang",
    component: xianyang
  },{
    path: "/baoji",
    name: "baoji",
    component: baoji,
    children:[{
      path: "/guozhen1",
      name: "guozhen1",
      component: guozhen1,
    },{
      path: "/guozhen2",
      name: "guozhen2",
      component: guozhen2,
    },{
      path: "/guozhen3",
      name: "guozhen3",
      component: guozhen3,
    }]
  },{
    path: "/xingping",
    name: "xingping",
    component: xingping
  }]
})
