package de.unistuttgart.ma.backend.utility;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import de.unistuttgart.gropius.ComponentInterface;

/**
 * 
 * Serialises a {@link ComponentInterface} to JSON.
 *
 */
public class InterfaceSerializer extends StdSerializer<ComponentInterface> {

	public InterfaceSerializer(Class<ComponentInterface> t) {
		super(t);
	}

	@Override
	public void serialize(ComponentInterface value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException {

		jgen.writeStartObject();
		jgen.writeStringField("name", value.getName());
		jgen.writeStringField("id", value.getId().toString());
		jgen.writeEndObject();
	}
}