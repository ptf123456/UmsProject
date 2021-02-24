<template>
  <div id="app">
    <div>
      <ul>
        <router-link to="/news">
          <li>热点新闻</li>
        </router-link>
        <li @click="technology">明星八卦</li>
        <li>
          <button type="button" v-on:click="submitFeel">技术期刊</button>
        </li>
        <li>
          <button type="button" v-on:click="submitHand">娱乐天地</button>
        </li>
      </ul>
    </div>
    <div>
      <router-view></router-view>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'App',
    methods:{
      technology: function () {
        // 使用编程方式为元素增加路由机制
        // $router是VueRouter 的对象，相当于一个全局的路由对象
        // push()相当于location.href
        this.$router.push("/technology");
      },
      submitFeel: function () {
        // 在进行路由连接时，进行参数的传递
        this.$router.push({
          // 当使用 name 属性时，则会根据该属性名所在的配置的路由中进行查找
          // 检查哪个路由的 name 属性值和所配路由的 name 属性相同
          // 如果匹配上，则会调用该路由进行工作
          name: "feel",
          // 在进行参数传递时，使用params 属性实现
          params: {
            message: "了一篇终于属于自己的期刊啊！！"
          }
        });
      },
      submitHand: function () {
        // 在传递参数时，使用参数的传递
        this.$router.push({
          // 对于path 属性来说，就是所发出的路由地址，也就是和所配路由的 path 属性相对应
          path: "submitFeel",
          // 在传递参数时，使用 query 属性实现
          // 当使用 query进行传值时，将请求参数直接变为get请求处理  链接在url地址之后
          query : {
            message: "今日爆料某明星出轨！！！"
          }
        });
      }
    }
  }
</script>

<style>

</style>
