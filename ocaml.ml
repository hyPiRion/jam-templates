(* Compile with `ocamlopt -o ocaml ocaml.ml` *)

let read_int () : int = 
  Scanf.bscanf Scanf.Scanning.stdin " %d " (fun x -> x)

let read_float () : float =
  Scanf.bscanf Scanf.Scanning.stdin " %f " (fun x -> x)

let () =
  for case = 1 to read_int () do
    
    (Printf.printf "Case #%d: %s\n" case "solution")
  done
