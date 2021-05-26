import Vue from 'https://cdn.jsdelivr.net/npm/vue@2.6.12/dist/vue.esm.browser.js'


var app = new Vue({
    el: '#login',

    data: {
      username: "",
      password: "",
      errors: [ 
          
      ]

    },
    methods:{
        verifyConnexion(e){

                fetch('/api/utilisateur/',
                {
                    method: 'POST',
                    headers: { "Content-Type": "application/json" },
                    body: JSON.stringify({ 
                        username: this.username,
                        password: this.password
                    })
                }).then(response => response.json())
                .then(function(data){
                    if(data){
                       alert("connecté!");
                    }
                    else{
                      e.preventDefault();
                    }
                })   
            }
        }
});