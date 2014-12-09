/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.metal;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTLResourceOptions/*</name>*/ extends Bits</*<name>*/MTLResourceOptions/*</name>*/> {
    /*<values>*/
    public static final MTLResourceOptions None = new MTLResourceOptions(0L);
    public static final MTLResourceOptions Default = new MTLResourceOptions(0L);
    public static final MTLResourceOptions WriteCombined = new MTLResourceOptions(1L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTLResourceOptions/*</name>*/[] values = _values(/*<name>*/MTLResourceOptions/*</name>*/.class);

    public /*<name>*/MTLResourceOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/MTLResourceOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTLResourceOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTLResourceOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/MTLResourceOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTLResourceOptions/*</name>*/[] values() {
        return values.clone();
    }
}
