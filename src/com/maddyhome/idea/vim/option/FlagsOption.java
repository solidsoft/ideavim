package com.maddyhome.idea.vim.option;

/*
* IdeaVim - A Vim emulator plugin for IntelliJ Idea
* Copyright (C) 2003 Rick Maddy
*
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* as published by the Free Software Foundation; either version 2
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/

import java.util.Iterator;

/**
 * This represents a set of one character flags
 */
public class FlagsOption extends BoundListOption
{
    /**
     * Create a flag based option
     * @param name The name of the option
     * @param abbrev The short name
     * @param dflt The list of default flags
     * @param values The list of possible flags
     */
    FlagsOption(String name, String abbrev, String[] dflt, String[] values)
    {
        super(name, abbrev, dflt, values);
    }

    /**
     * Overrides parent so there are no commas in the value
     * @return The list of flags
     */
    public String getValue()
    {
        StringBuffer res = new StringBuffer();
        for (Iterator iterator = value.iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            res.append(s);
        }

        return res.toString();
    }
}