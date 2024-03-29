package de.unistuttgart.ma.backend.utility;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import de.unistuttgart.ma.saga.SagaStep;

/**
 * Serialises a {@link SagaStep} to JSON.
 */
public class StepSerializer extends StdSerializer<SagaStep> {

	public StepSerializer(Class<SagaStep> t) {
		super(t);
	}

	@Override
	public void serialize(SagaStep value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
		jgen.writeStartObject();
		jgen.writeStringField("name", value.getName());
		jgen.writeStringField("id", value.getId().toString());
		jgen.writeEndObject();
	}
}