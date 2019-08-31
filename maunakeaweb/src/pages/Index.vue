<template>
  <div>
  <div class="text-h3 q-mt-lg"
       align="center">
    <strong>Sacred Mauna Kea</strong>
  </div>
      <div class="q-ma-lg row q-gutter-md justify-center">
        <q-card class="my-card">
          <img src="../statics/kucampingMauna.jpg">
          <q-card-section>
            <div class="text-h5 q-ma-xl"
                 align="center">
              History
            </div>
            <p>
              Mauna Kea is a shield volcano that measures to 13,796 feet,
            and is the tallest mountain in the world measured
            below sea level. Yet its ancient history and importance to the Hawaiian people
            outweigh its physical features.
            </p>
<!--            <ul id="importanceBullet">-->
<!--              <li v-for="item in importance" :key="item.message">-->
<!--                {{ item.message }}-->
<!--              </li>-->
<!--            </ul>-->
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
        { message: 'History' },
        { message: 'Why it is sacred' },
        { message: 'Its meaning to Hawaiian and polynesian people' },
        { message: 'The reason for fighting' },
        { message: 'Peaceful protest' },
        { message: 'Aʻole TMT' },
      ],
    };
  },
};
</script>
