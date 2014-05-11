import std.stdio;

void main() {
  int T;
  readf("%s", &T);
  foreach (t; 1..T+1) {
    writefln("Case #%d: %s", t, "foo");
  }
}
