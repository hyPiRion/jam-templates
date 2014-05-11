#!/usr/bin/sbcl --script

(setf *read-default-float-format* 'double-float)

(defun solve ()
  nil)

(loop for t- from 1 to (read)
   do (format t "Case #~A: ~A~%" t- (solve)))
