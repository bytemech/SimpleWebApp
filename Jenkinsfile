node {
   stage('Preparation') {
      git 'https://github.com/bytemech/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}