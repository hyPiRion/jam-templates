#!/usr/bin/guile -s
!#

(use-modules (ice-9 popen))

(define (solve)
  #nil)

(define T (read))

(let main ((t 1))
  (when (<= t T)
        (format #t "Case #~A: ~A~%" t (solve))
        (main (+ t 1))))
