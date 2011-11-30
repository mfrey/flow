fm = get_instance();










r = fm:create_operator_of_type("r", "math");
r:set_parameter("step_size_num", "1");
r:set_parameter("window_type", "elements");
r:set_parameter("operationType", "add");
r:set_parameter("literal", "5");
ERROR: The number of input streams is zero!

t = fm:create_operator_of_type("t", "math");
t:set_parameter("step_size_num", "1");
t:set_parameter("window_type", "elements");
t:set_parameter("operationType", "sub");
t:set_parameter("literal", "42.3");
ERROR: The number of input streams is zero!

u = fm:create_operator_of_type("u", "math");
u:set_parameter("step_size_num", "1");
u:set_parameter("window_type", "elements");
u:set_parameter("operationType", "mult");
u:set_parameter("stream", "r");
u:set_parameter("element", "element");
ERROR: The number of input streams is zero!

v = fm:create_operator_of_type("v", "math");
v:set_parameter("step_size_num", "10");
v:set_parameter("window_type", "elements");
v:set_parameter("operationType", "div");
v:set_parameter("literal", "9");
ERROR: The number of input streams is zero!
fm:start(v);
fm:start(u);
fm:start(t);
fm:start(r);
fm:stop(v);
fm:stop(u);
fm:stop(t);
fm:stop(r);
