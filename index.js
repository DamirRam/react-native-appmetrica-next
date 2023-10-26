/*
 * Version for React Native
 * © 2020 YANDEX
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://yandex.com/legal/appmetrica_sdk_agreement/
 */

import {NativeModules, Platform} from 'react-native';

const {AppMetrica} = NativeModules;

export default {

  activate(config) {
    AppMetrica.activate(config);
  },

  initPush(token = ''){
    if(Platform.OS === 'android') {
      AppMetrica.initPush();
    } else {
      AppMetrica.initPush(token);
    }
  },

  getToken(){
    return AppMetrica.getToken();
  },

  reportUserProfile(config){
    AppMetrica.reportUserProfile(config);
  },

  // Android
  async getLibraryApiLevel() {
    return AppMetrica.getLibraryApiLevel();
  },

  async getLibraryVersion() {
    return AppMetrica.getLibraryVersion();
  },

  pauseSession() {
    AppMetrica.pauseSession();
  },

  reportAppOpen(deeplink) {
    AppMetrica.reportAppOpen(deeplink);
  },

  reportError(error, reason) {
    AppMetrica.reportError(error);
  },

  reportEvent(eventName, attributes) {
    AppMetrica.reportEvent(eventName, attributes);
  },

  reportRevenue(params, order) {
    AppMetrica.reportRevenue(params, order);
  },

  reportReferralUrl(referralUrl) {
    AppMetrica.reportReferralUrl(referralUrl);
  },

  requestAppMetricaDeviceID(listener) {
    AppMetrica.requestAppMetricaDeviceID(listener);
  },

  resumeSession() {
    AppMetrica.resumeSession();
  },

  sendEventsBuffer() {
    AppMetrica.sendEventsBuffer();
  },

  setLocation(location) {
    AppMetrica.setLocation(location);
  },

  setLocationTracking(enabled) {
    AppMetrica.setLocationTracking(enabled);
  },

  setStatisticsSending(enabled) {
    AppMetrica.setStatisticsSending(enabled);
  },

  setUserProfileID(userProfileID) {
    AppMetrica.setUserProfileID(userProfileID);
  },

  // Ecommerce events
  showScreen(params) {
    AppMetrica.showScreen(params);
  },

  showProductCard(params) {
    AppMetrica.showProductCard({originalPrice: '0', promoCode: '', ...params});
  },

  addToCart(product) {
    AppMetrica.addToCart({originalPrice: '0', promoCode: '', ...product});
  },

  removeFromCart(product) {
    AppMetrica.removeFromCart({originalPrice: '0', promoCode: '', ...product});
  },

  beginCheckout(products, identifier) {
    AppMetrica.beginCheckout(products, identifier);
  },

  finishCheckout(products, identifier, payload) {
    AppMetrica.finishCheckout(products, identifier, payload);
  },
};

