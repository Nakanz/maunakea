<template>
  <div class="q-pa-md row q-gutter-lg">
    <q-card class="my-card1">
      <img src="../statics/mauiheenalu.jpg">
      <q-tabs v-model="tabHeenalu" class="text-teal">
        <q-tab label="about" name="one" />
        <q-tab label="their movement" name="two" />
      </q-tabs>
      <q-card-section>
        <div class="text-h6">Heʻe Nalu No Ka Mauna</div>
      </q-card-section>
      <q-separator />

      <q-tab-panels v-model="tabHeenalu" animated>
        <q-tab-panel name="one">
          Anti-TMT surfers/activists create a triangle of surfboards
          and water gear to represent Mauna Kea, a mountain they consider sacred.
        </q-tab-panel>

        <q-tab-panel name="two">
          Thousands of surfers around the world used social media earlier
          this month to educate their fans and followers of the Thirty Meter Telescope project.
        </q-tab-panel>
      </q-tab-panels>
    </q-card>

    <q-card class="my-card2">
      <img src="../statics/roadblockage.jpg">
      <q-tabs v-model="tabRoadblock" class="text-teal">
        <q-tab label="about" name="one" />
        <q-tab label="their movement" name="two" />
      </q-tabs>
      <q-card-section>
        <div class="text-h6">Mauna Kea Access Road Block</div>
      </q-card-section>
      <q-separator />

      <q-tab-panels v-model="tabRoadblock" animated>
        <q-tab-panel name="one">
          Protestors created a roadblock to hault TMT construction vehicles
          and UH astronomers
        </q-tab-panel>

        <q-tab-panel name="two">
          Over 35 kūpuna were arrested because of the blockade
        </q-tab-panel>
      </q-tab-panels>
    </q-card>

    <q-card class="my-card3">
      <img src="../statics/protectMaunaKea.jpg">
      <q-tabs v-model="tabProtest" class="text-teal">
        <q-tab label="about" name="one" />
        <q-tab label="their movement" name="two" />
      </q-tabs>
      <q-card-section>
        <div class="text-h6">Street Protests</div>
      </q-card-section>
      <q-separator />

      <q-tab-panels v-model="tabProtest" animated>
        <q-tab-panel name="one">
          Thousands make their way to the streets of Waikīkī to rally against TMT construction
        </q-tab-panel>

        <q-tab-panel name="two">
          Kalākaua Avenue was blocked around 11 a.m. on July 21 by thousands of
          people rallying against the construction of the Thirty Meter Telescope on Maunakea.
          The rally was not merely focused on protest— it was also a cultural celebration,
          with rallying speeches punctuated by hula and song.
        </q-tab-panel>
      </q-tab-panels>
    </q-card>
  </div>
</template>

<script>
export default {
  name: 'Movements',
  data() {
    return {
      tabHeenalu: 'one',
      tabRoadblock: 'one',
      tabProtest: 'one',
    };
  },
};
</script>

<style lang="stylus" scoped>
  .my-card1
    width 25%
  .my-card2
    width 25%
  .my-card3
    width 25%
  .my-card4
    width 25%
</style>
