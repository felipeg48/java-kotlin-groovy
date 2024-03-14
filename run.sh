#! /bin/zsh

echo "Starting HTTP Server on 8001/8002 - http://localhost:8001/deck_01.html - http://localhost:8002/index.html"
python -m http.server 8001 --directory build/docs/asciidocRevealJs > /dev/null 2>&1 &
PID1="$!"
python -m http.server 8002 --directory build/docs/asciidoc > /dev/null 2>&1 &
PID2="$!"


echo "Website: HTTP Server PIDs: $PID1 - $PID2"
echo "Starting Watcher..."
fswatch -o src/ | while read num ; \
do
 reset
 echo "Website: HTTP Server PIDs: $PID1 - $PID2"
 echo "Converting..."
 ./gradlew asciidoctor -b build-html.gradle > /dev/null 2>&1
 ./gradlew asciidoctor -b build-revealjs.gradle > /dev/null 2>&1
 echo "Done."
done
