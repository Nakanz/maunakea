<template>
  <q-page class="flex">
    <div class="q-pa-md">
      <q-footer>
        <q-banner rounded class="bg-secondary text-white">

          We can't find your saved recipes until you sign in.

          <template v-slot:action>
            <q-btn flat color="white" label="Continue as a Guest"/>
            <q-btn flat color="white" label="Sign in" />
          </template>
        </q-banner>
      </q-footer>
    </div>
  </q-page>
</template>

<style>
</style>

<script>
export default {
  name: 'PageIndex',
};
</script>
