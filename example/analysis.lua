fm = get_instance();









r = fm:create_operator_of_type("r", "avg");
r:set_parameter("step_size_num", "1");
r:set_parameter("window_type", "elements");
r:set_parameter("element", "element");
fm:connect_operators(r, "out", s, "in");

t = fm:create_operator_of_type("t", "std");
t:set_parameter("step_size_num", "20");
t:set_parameter("window_type", "elements");
t:set_parameter("element", "element");
fm:connect_operators(t, "out", r, "in");

u = fm:create_operator_of_type("u", "count");
u:set_parameter("step_size_num", "600000");
u:set_parameter("window_type", "time");
u:set_parameter("element", "element");
fm:connect_operators(u, "out", t, "in");
fm:start(u);
fm:start(t);
fm:start(r);
fm:stop(u);
fm:stop(t);
fm:stop(r);
