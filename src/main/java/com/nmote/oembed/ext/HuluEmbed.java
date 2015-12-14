package com.nmote.oembed.ext;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmote.oembed.About;
import com.nmote.oembed.BasicOEmbed;

public class HuluEmbed extends BasicOEmbed {

	private static final long serialVersionUID = About.SERIAL_VERSION_UID;

	@JsonProperty("air_date")
	private String airDate;

	@JsonProperty("duration")
	private Float duration;

	@JsonProperty("embed_url")
	private String embedUrl;

	@JsonProperty("large_thumbnail_height")
	private Integer largeThumbnailHeight;

	@JsonProperty("large_thumbnail_url")
	private String largeThumbnailUrl;

	@JsonProperty("large_thumbnail_width")
	private Integer largeThumbnailWidth;

}
