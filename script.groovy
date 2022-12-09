def pushToNexus() {
    echo "pushing the jar file to Nexus maven-snapshots repo..."
    bat 'mvn clean install -D maven.test.skip=true'
    nexusArtifactUploader artifacts: [[artifactId: 'DevOpsProject', classifier: '', file: 'target/DevOpsProject-0.0.1-SNAPSHOT.jar', type: 'jar']], credentialsId: 'nexus-credentials', groupId: 'com.example', nexusUrl: 'localhost:8081', nexusVersion: 'nexus3', protocol: 'http', repository: 'maven-snapshots', version: '0.0.1-SNAPSHOT'
}


def sonarScan() {
    echo "Run sonarQube scan..."
    bat "mvn clean verify sonar:sonar -D sonar.projectKey=pipeline -D maven.test.skip=true  -D sonar.login=sqp_c412d6bb7ea105e99df221b0a1fe27f6d265959a"
}

return this