def call(ip,id,username){
sshagent(['id']) {
sh "mv target/sunil*.war target/sunil.war"
                                    // war file
sh "scp -o StrictHostKeyChecking=no target/sunil.war ec2-user@${ip}:/opt/tomcat9/webapps"
  sh "ssh ${username}@${ip} /opt/tomcat9/bin/shutdown.sh"
  sh "ssh ${username}@${ip} /opt/tomcat9/bin/startup.sh"
}
}