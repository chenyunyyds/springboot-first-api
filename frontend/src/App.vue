<script setup>
import { ref } from 'vue'

const username = ref('')
const password = ref('')
const result = ref('')

function login(){
  if(
      username.value === 'root'
      &&
      password.value === '123456'

  ){
    result.value = '登陆成功'
  }else{
    result.value = '账号或密码错误'
  }
}

</script>

<template>

<h1>Vue 登录测试</h1>
<input
  v-model="username"
  placeholder="请输入用户名"
>

<br><br>

<input
  type="password"
  v-model="password"
  placeholder="请输入密码"

>

<br><br>

<button @click="login">
  登录
</button>

<p>
  {{ result }}
</p>

</template>
