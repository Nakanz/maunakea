import axios from 'axios';

const axiosInstance = axios.create({
  baseURL: 'http://localhost:8080', // will need to replace this with whatever base you are using
  headers: { Pragma: 'no-cache' },
});

export default async ({ Vue }) => {
  Vue.prototype.$axios = axiosInstance;
};

export { axiosInstance };
