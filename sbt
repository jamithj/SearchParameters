java -Dsbt.boot.realm="Artifactory Realm" -Dsbt.boot.host="artifactory-remote.its.monash.edu" -Dsbt.boot.user=sbt -Dsbt.boot.password=password -Xmx1024M -Xss2M -XX:MaxPermSize=512m -XX:+CMSClassUnloadingEnabled -jar `dirname $0`/sbt-launch-0.13.5.jar "$@"