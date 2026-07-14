<script setup lang="ts">
import { ref, onMounted } from 'vue'

const message = ref('Loading...')
const messageAll = ref('Loading...')

onMounted(async () => {
  try {
    const response = await fetch('http://localhost:8080/hello')
    message.value = await response.text()
  } catch (err) {
    message.value = 'Failed to reach the API /hello'
  }
  try {
    const response = await fetch('http://localhost:8080/hello/all')
    const data = await response.json()
    messageAll.value = JSON.stringify(data, null, 2)
  } catch (err) {
    messageAll.value = 'Failed to reach the API /hello/all'
  }
})
</script>

<template>
  <main>
    <h1>Hello Page</h1>
    <p>{{ message }}</p>
    <h1>Hello Database</h1>
    <pre>{{ messageAll }}</pre>
    <p>
      <RouterLink to="/">Back to Home</RouterLink>
    </p>
  </main>
</template>
