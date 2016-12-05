angular.module('loadIndex', [])
  .controller('index', function($http) {
  var self = this;
  $http.get('/resource/').then(function(response) {
    self.greeting = response.data;
  })
});