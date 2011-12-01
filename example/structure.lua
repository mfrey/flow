fm = get_instance();










join384746795 = fm:create_operator_of_type("join384746795", "merge");
fm:connect_operators(t, "out", s, "in0");
fm:connect_operators(t, "out", r, "in1");

stream147 = fm:create_operator_of_type("stream147", "split");
fm:connect_operators(u, "out0", t, "in");
fm:connect_operators(v, "out1", t, "in");
fm:start(join384746795);
fm:start(stream147);
fm:stop(join384746795);
fm:stop(stream147);
