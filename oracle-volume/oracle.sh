clear
docker run -d --name oracle -p 1522:1521 -e ORACLE_PASSWORD=admin gvenzl/oracle-xe
docker container logs oracle
