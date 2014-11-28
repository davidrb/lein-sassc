(defproject org.clojars.aew/lein-sassc "0.10.0"
  :description "Leiningen plugin to compile SASS/SCSS files with SassC."
  :url "https://github.com/aew/lein-sassc"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :scm {:name "git"
        :url "https://github.com/aew/lein-sassc"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [me.raynes/fs "1.4.6"]]
  :hooks [leiningen.sassc]
  :eval-in-leiningen true
  :min-lein-version "2.5.0")
