package no.vindsiden.parser.impl.support;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class JodaTimeConverter implements Converter {

	@SuppressWarnings("rawtypes")
	@Override
	public boolean canConvert(final Class type) {
		return DateTime.class.isAssignableFrom(type);
	}

	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer,
			MarshallingContext context) {
		DateTime dateTime = new DateTime(source.toString());
		writer.setValue(dateTime.toString(ISODateTimeFormat
				.dateTimeNoMillis()));
	}

	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			com.thoughtworks.xstream.converters.UnmarshallingContext arg0) {
		return new DateTime(reader.getValue());
	}
	}
