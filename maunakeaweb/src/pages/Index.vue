<template>
      <div class="q-ma-lg row items-start q-gutter-md justify-center">
        <q-card class="my-card">
          <q-card-section>
            <div class="text-h5"><strong>The Importance of Mauna Kea</strong></div>
          </q-card-section>
          <img src="../statics/maunaAWakea.jpg">
          <q-card-section>
            <ul id="importanceBullet">
              <li v-for="item in importance" :key="item.message">
                {{ item.message }}
              </li>
            </ul>
          </q-card-section>
        </q-card>
        <q-card class="my-card">
          <img src="../statics/kamaoli.jpg">

          <q-card-section>
            <div class="text-h6">Protectors of Mauna Kea</div>
          </q-card-section>

          <q-card-section>
            {{ protectors }}
          </q-card-section>
        </q-card>
      </div>
</template>

<style lang="stylus" scoped>
  .my-card
    width 750%
    max-width 1150px
</style>

<script>
export default {
  name: 'PageIndex',
  data() {
    return {
      protectors: 'Something about the movement and peaceful protest',
      importance: [
        { message: '' },
        { message: '' },
        { message: '' },
        { message: '' },
        { message: '' },
        { message: '' },
      ],
    };
  },
};
</script>
