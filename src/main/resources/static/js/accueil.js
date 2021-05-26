import Vue from 'https://cdn.jsdelivr.net/npm/vue@2.6.12/dist/vue.esm.browser.js'


var app = new Vue({
    el: '#accueil',

    data: {
        

    },
    methods:{
        logout() {
            fetch('/api/utilisateur/logout',
            {
                method: 'GET',
                headers: { "Content-Type": "application/json" }
            })
        }
        
    }
});