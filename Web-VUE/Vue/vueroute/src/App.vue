<template>
  <div id="app">
    <h1>
      <!-- 要想产生路由连接，则必须使用标签 router-link -->
      <!-- 在浏览器进行解析时，就会把 router-link 解析成为a标签-->
      <!-- 对于router-link 标签 to 属性就相当与 a 标签的 href 属性-->
      <!-- 当点击该连接时，Vue 就会加载路由文件 也就是router 文件夹下的 index.js -->
      <!-- 在其中查找该连接和哪个组件相对应 -->
      <router-link to="/show">点击一下</router-link>
    </h1>
    <!-- 要想显示所通过路由所加载的组件，使用标签router-view 进行显示 -->
    <!-- router-view 标签必须和 router-link 都存储在一个根元素下-->
    <router-view></router-view>
  </div>

</template>

<script>
export default {
  name: 'App'
}
</script>

