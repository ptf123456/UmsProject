<template>
  <div id="app">
    <router-link to="/test/hello">
      <label>测试路由机制进行参数传递</label>
    </router-link>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
  label {
    font: bold normal 30px "Microsoft Yi Baiti";
    text-decoration: none;
  }
</style>
