(defproject apple-code-challenge "0.1.0-SNAPSHOT"
  :description "Advent of code solutions for day 1, 2 and 4"
  :url "http://adventofcode.com/2017/day/1"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot apple-code-challenge.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
