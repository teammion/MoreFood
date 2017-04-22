/*
 * Copyright (c) 2016 - 2017, Team Mion
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package org.teammion.morefood;

import org.teammion.morefood.block.BlockStrawberryBush;
import org.teammion.morefood.util.Registry;

/**
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class Blocks extends net.minecraft.init.Blocks
{
    public static final BlockStrawberryBush STRAWBERRY_BUSH = new BlockStrawberryBush();
    
    public static void register()
    {
        Registry.register(STRAWBERRY_BUSH);
    }
}