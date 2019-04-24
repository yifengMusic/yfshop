cd ..
cd yfshop-dependencies
call mvn clean deploy

cd ..
cd yfshop-common
call mvn clean deploy

cd ..
cd yfshop-common-domain
call mvn clean deploy

cd ..
cd yfshop-common-service
call mvn clean deploy

cd ..
cd yfshop-common-web
call mvn clean deploy

cd ..
