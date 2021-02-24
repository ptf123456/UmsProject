<template>
  <div id="app">
    <div class="nav">
      <ul>
        <a href="#" @click="kingdom">
          <li>三国</li>
        </a>
        <router-link to="/enjoy">
          <li>西游</li>
        </router-link>
        <router-link to="/water">
          <li>水浒</li>
        </router-link>
      </ul>
    </div>
    <div class="message">
      <router-view></router-view>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'App',
    methods: {
      kingdom: function () {
       this.$router.push({
         name:"kingdom",
         params:{
           isLogin: true
         }
       });
      }
    }
  }
</script>

<style>
  .nav {
    width: 1060px;
    height: 50px;
    margin: 100px 400px;
  }
  .nav li{
    list-style-type: none;
    float: left;
    font: bold normal 26px "Microsoft Yi Baiti";
    width: 200px;
    height: 50px;
    border: 1px solid chocolate;
    text-align: center;
    line-height: 50px;
    background: coral;
    color: crimson;
    border-radius: 5px;
    margin: 0px 5px;
  }
  .message {
    width: 1100px;
    height: 300px;
    margin: 10px auto;
    border: 1px solid fuchsia;
    border-radius: 10px;
    text-align: center;
    line-height: 300px;
    font: bold normal 20px "Microsoft Yi Baiti";
  }
</style>
