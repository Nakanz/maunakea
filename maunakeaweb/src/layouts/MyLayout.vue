<template>
  <q-layout view="hHh Lpr lff">
    <q-header elevated>
      <q-toolbar>
        <q-btn
          flat
          dense
          round
          @click="drawer = !drawer"
          aria-label="Menu"
        >
          <img src="../statics/icons/mountain-512.png" style="width: 30px">
        </q-btn>

        <q-toolbar-title>
<!--          <img src="../statics/icons/mountain-512.png" style="width: 30px">-->
          Mauna a Wākea
        </q-toolbar-title>
      </q-toolbar>
      <q-toolbar inset>
        <q-breadcrumbs active-color="white" style="font-size: 16px">
          <q-breadcrumbs-el label="Home" icon="home" to="/"/>
          <q-breadcrumbs-el label="Movements" icon="group" to="/movements"/>
          <q-breadcrumbs-el label="News" icon="waves" to="/news"/>
          <q-breadcrumbs-el :label="getPath">
            <q-tooltip>
              Current Page
            </q-tooltip>
          </q-breadcrumbs-el>
        </q-breadcrumbs>

        <q-space/>

        <div class="q-gutter-sm row items-center no-wrap">
          <q-item clickable v-close-popup tag="a" target="_blank" href="https://www.instagram.com/protectmaunakea/?hl=en">
            <q-item-section>
              <q-icon name="fab fa-instagram"/>Instagram
            </q-item-section>
          </q-item>
          <q-item clickable v-close-popup tag="a" target="_blank" href="https://twitter.com/protectmaunakea?lang=en">
            <q-item-section>
              <q-icon name="fab fa-twitter"/>Twitter
            </q-item-section>
          </q-item>
          <q-item clickable v-close-popup tag="a" target="_blank" href="https://www.facebook.com/protectmaunakea/">
            <q-item-section>
              <q-icon name="fab fa-facebook"/>Facebook
            </q-item-section>
          </q-item>

          <q-btn
              flat
              dense
              round
              icon="supervisor_account"
          >
            <q-menu>
              <q-list style="min-width: 100px">
                <q-item clickable v-close-popup>
                  <q-item-section>Sign Up</q-item-section>
                </q-item>
                <q-item clickable v-close-popup>
                  <q-item-section>Login</q-item-section>
                </q-item>
              </q-list>
            </q-menu>
          </q-btn>
        </div>
      </q-toolbar>
    </q-header>
    <q-drawer
      v-model="drawer"
      show-if-above

      :mini="miniState"
      @mouseover="miniState = false"
      @mouseout="miniState = true"
      mini-to-overlay

      :width="275"
      :breakpoint="500"
      elevated
      content-class="bg-grey-3"
    >
      <q-scroll-area class="fit">
        <q-list>
          <q-item-label header>Ways to Get Involved</q-item-label>
          <q-item clickable tag="a" target="_blank" href="https://quasar.dev">
            <q-item-section avatar>
              <q-icon name="school" />
            </q-item-section>
            <q-item-section>
              <q-item-label>Docs</q-item-label>
              <q-item-label caption>quasar.dev</q-item-label>
            </q-item-section>
          </q-item>
          <q-item clickable tag="a" target="_blank" href="https://github.quasar.dev">
            <q-item-section avatar>
              <q-icon name="mail" />
            </q-item-section>
            <q-item-section>
              <q-item-label>Sign up</q-item-label>
              <q-item-label caption>Subscribe to email</q-item-label>
              <q-item-label caption>updates!</q-item-label>
            </q-item-section>
          </q-item>
          <q-item clickable tag="a" target="_blank" href="https://chat.quasar.dev">
            <q-item-section avatar>
              <q-icon name="attach_money" />
            </q-item-section>
            <q-item-section>
              <q-item-label>Donate</q-item-label>
              <q-item-label caption>Support the cause!</q-item-label>
            </q-item-section>
          </q-item>
          <q-item clickable tag="a" target="_blank" href="https://www.instagram.com/protectmaunakea/?hl=en">
            <q-item-section avatar>
              <q-icon name="record_voice_over" />
            </q-item-section>
            <q-item-section>
              <q-item-label>Instagram</q-item-label>
              <q-item-label caption>@protectmaunakea</q-item-label>
            </q-item-section>
          </q-item>
          <q-item clickable tag="a" target="_blank" href="https://twitter.com/protectmaunakea?lang=en">
            <q-item-section avatar>
              <q-icon name="rss_feed" />
            </q-item-section>
            <q-item-section>
              <q-item-label>Twitter</q-item-label>
              <q-item-label caption>@ProtectMaunaKea</q-item-label>
            </q-item-section>
          </q-item>
          <q-item clickable tag="a" target="_blank" href="https://www.facebook.com/protectmaunakea/">
            <q-item-section avatar>
              <q-icon name="public" />
            </q-item-section>
            <q-item-section>
              <q-item-label>Facebook</q-item-label>
              <q-item-label caption>@protectmaunakea</q-item-label>
            </q-item-section>
          </q-item>
        </q-list>
      </q-scroll-area>
    </q-drawer>

    <q-page-container>
      <router-view />
    </q-page-container>
  </q-layout>
</template>

<script>
import { openURL } from 'quasar';

export default {
  name: 'MyLayout',
  data() {
    return {
      drawer: false,
      miniState: true,
      currentPath: '',
    };
  },
  methods: {
    openURL,
  },
  computed: {
    getPath() {
      return '@' + this.$route.name;
    },
  },
};
</script>

<style>
</style>
