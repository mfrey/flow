fm = get_instance();
a = fm:create_operator_of_type("a", "CacheIn");
a:set_parameter("list_iris", "http://www.test.de ");
a:set_parameter("connector_socket_address", "localhost");
a:set_parameter("connector_socket_port", "9595");
d = fm:create_operator_of_type("d", "Math");
d:set_parameter("operationType", "add");
d:set_parameter("literal", "2");
fm:connect_operators(d, "out", a, "in");
e = fm:create_operator_of_type("e", "Math");
e:set_parameter("operationType", "sub");
e:set_parameter("literal", "42");
fm:connect_operators(e, "out", d, "in");
f = fm:create_operator_of_type("f", "Math");
f:set_parameter("operationType", "mult");
f:set_parameter("stream", "e");
f:set_parameter("element", "element");
f:set_parameter("stream_op", "e");
f:set_parameter("element_op", "anotherElement");
fm:connect_operators(f, "out", e, "in");
g = fm:create_operator_of_type("g", "Math");
g:set_parameter("operationType", "div");
g:set_parameter("literal", "3");
fm:connect_operators(g, "out", f, "in");
h = fm:create_operator_of_type("h", "Math");
h:set_parameter("operationType", "mod");
h:set_parameter("literal", "2");
fm:connect_operators(h, "out", g, "in");
fm:start(f);
fm:start(g);
fm:start(d);
fm:start(e);
fm:start(a);
fm:start(h);
fm:stop(f);
fm:stop(g);
fm:stop(d);
fm:stop(e);
fm:stop(a);
fm:stop(h);