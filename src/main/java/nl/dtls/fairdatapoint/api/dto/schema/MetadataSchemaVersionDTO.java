/**
 * The MIT License
 * Copyright © 2017 DTL
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package nl.dtls.fairdatapoint.api.dto.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import nl.dtls.fairdatapoint.entity.schema.MetadataSchemaType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MetadataSchemaVersionDTO {

    @NotNull
    @NotBlank
    private String uuid;

    @JsonInclude(JsonInclude.Include.ALWAYS)
    private String version;

    @JsonInclude(JsonInclude.Include.ALWAYS)
    private String versionUuid;

    @JsonInclude(JsonInclude.Include.ALWAYS)
    private String previousVersionUuid;

    @NotNull
    @NotBlank
    private String name;

    private boolean published;

    private boolean abstractSchema;

    private boolean latest;

    @NotNull
    private MetadataSchemaType type;

    @JsonInclude(JsonInclude.Include.ALWAYS)
    private String origin;

    @JsonInclude(JsonInclude.Include.ALWAYS)
    private String importedFrom;

    @NotNull
    private String definition;

    @NotNull
    private String description;

    @NotNull
    private Set<String> targetClasses;

    @NotNull
    private List<String> extendsSchemaUuids;

    @JsonInclude(JsonInclude.Include.ALWAYS)
    private String suggestedResourceName;

    @JsonInclude(JsonInclude.Include.ALWAYS)
    private String suggestedUrlPrefix;
}
