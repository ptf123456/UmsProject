<template>
  <div id="app">
    <div class="container">
      <ul>
        <router-link to="/xian">
          <li>西安市</li>
        </router-link>
        <router-link to="/baoji">
          <li>宝鸡市</li>
        </router-link>
        <router-link to="/xingping">
          <li>兴平市</li>
        </router-link>
        <router-link to="/xianyang">
          <li>咸阳市</li>
        </router-link>
      </ul>
    </div>
    <div class="container">
      <router-view></router-view>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'App'
  }
</script>

<style>
  ul{
    margin-left: 100px;
  }
  li {
    list-style-type: none;
    float: left;
    width: 300px;
    height: 50px;
    font: bold normal 40px "Microsoft YaHei UI";
    border: 1px solid hotpink;
    text-align: center;
    line-height: 50px;
  }
  .container {
    width: 1522px;
    height: 110px;
    margin: 10px auto;
    text-align: center;
  }
</style>
