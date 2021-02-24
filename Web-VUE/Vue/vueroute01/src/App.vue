<template>
  <div id="app">
    <ul>
      <router-link to="/wang">
        <li>
          王安石
        </li>
      </router-link>
      <router-link to="/su">
        <li>
          苏东坡
        </li>
      </router-link>
      <router-link to="/li">
        <li>
          李清照
        </li>
      </router-link>
    </ul>
    <div id="show">
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
  #app{
    margin: 200px 200px;
  }
  ul {
    list-style-type: none;
  }
  li {
    float: left;
    width: 300px;
    height: 50px;
    border: 1px solid red;
    text-align: center;
    line-height: 50px;
  }
  a {
    text-decoration: none;
  }
  #show {
    width: 600px;
    height: 100px;
    font: bold normal 20px "Microsoft Yi Baiti";
    text-align: center;
    margin: 0px 260px;
    padding: 200px 0;
  }
</style>
