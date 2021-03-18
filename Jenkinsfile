node {
   stage('Preparation') {
      git 'https://github.com/bytemech/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
   stage('Deploy') {
      sh "git push https://git.heroku.com/safe-spire-33617.git"
   }
}