#!/usr/bin/env clojure

(defn solve [args]
  ;; Your solution here
  )

(defn read-input []
  ;; Read input here. NB: Must be eager
  )

(defn pprint-result [t result]
  ;; Change this one as you see fit
  (format "Case #%d: %s" (inc t) result))

(defn main []
  (let [T (read)
        inputs (doall (repeatedly T read-input))
        results (pmap solve inputs)]
    (->> (map-indexed pprint-result results)
         (s/join "\n")
         (println))
    (flush)
    (System/exit 0)))
