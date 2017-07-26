# Building
## Building with Lumo
Currently doesn't work.

    lumo -c src/ scripts/build.cljs

## Building with ClojureScript

    wget https://github.com/clojure/clojurescript/releases/download/r1.9.671/cljs.jar
    java -cp cljs.jar:src clojure.main scripts/build.clj

# Running

    $ lumo main.js
    Hello, world!
    00042

    $ node main.js
    Hello, world!
    00042
