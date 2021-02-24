import Vue from 'vue'
import Router from 'vue-router'
import kingdom from "@/components/kingdom";
import enjoy from "@/components/enjoy";
import water from "@/components/water";

Vue.use(Router)

const router = new Router({
  routes: [{
      path: '/kingdom',
      name: 'kingdom',
      component: kingdom
    },{
      path: '/enjoy',
      name: 'enjoy',
      component: enjoy
    },{
      path: '/water',
      name: 'water',
      component: water
    }]
})
// 为路由进行设定守护 (全局路由)
router.beforeEach((to, from, next) => {
  // 获得  to 和 from 的信息
  // console.log(to);
  // console.log(from);
  // to 代表的是要去的组件，而 from 则代表从哪个组件来的
  // 通过检测 to 组件中的 path  或者相关属性判断是否允许进行连接
  // 获取此时的 path 信息
  let path = to.path;
  // 获得请求时所携带的参数
  let isLogin = to.params.isLogin;
  // console.log(path + " " + isLogin);
  if ("/kingdom" == path) {
      // 判断此时用户是否登录
    if (isLogin) {
      // 允许登录
      next();
    } else {
      // 此时未登录，定向到新闻页面
    }
  }else {
    // 此时用户点击的不是三国，那么允许加载组件
    next();
  }
})
// 将创建好的路由导出
export default  router;

